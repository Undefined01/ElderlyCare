package citicup.elderlycare
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


class RecommendActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recommend)
        val img1 = findViewById<ImageView>(R.id.arrow1)
        img1.setOnClickListener {
            openWebPage("http://www.cntaiping.com/upload/cms/tppension/201901/07163224l0zw.pdf")
        }
        val img2 = findViewById<ImageView>(R.id.arrow2)
        img2.setOnClickListener {
            openWebPage("http://www.cntaiping.com/upload/cms/tppension/201812/041752511xq7.pdf")
        }
        val img3 = findViewById<ImageView>(R.id.arrow3)
        img3.setOnClickListener {
            openWebPage("http://www.cntaiping.com/upload/cms/tppension/201812/04175138jgfk.pdf")
        }
    }

    private fun openWebPage(url: String?) {
        val webpage = Uri.parse(url)
        val intent = Intent(Intent.ACTION_VIEW, webpage)
        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
        }
    }

}