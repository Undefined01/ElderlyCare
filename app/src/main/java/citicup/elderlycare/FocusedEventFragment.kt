package citicup.elderlycare

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import java.text.DateFormat

class FocusedEventFragment : Fragment() {

    companion object {
        fun newInstance() = FocusedEventFragment()
    }

    private lateinit var viewModel: FocusedEventViewModel

    private lateinit var dateView: TextView
    private lateinit var titleView: TextView
    private lateinit var contentView: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.focused_event_fragment, container, false)
        dateView = root.findViewById(R.id.focused_event_date)
        titleView = root.findViewById(R.id.focused_event_title)
        contentView = root.findViewById(R.id.focused_event_content)
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(FocusedEventViewModel::class.java)
        // TODO: Use the ViewModel
        dateView.text = DateFormat.getDateInstance().format(viewModel.date)
        titleView.text = viewModel.title
        contentView.text = viewModel.briefContent
    }

}