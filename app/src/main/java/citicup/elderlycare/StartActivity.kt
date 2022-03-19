package citicup.elderlycare

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import citicup.elderlycare.ui.login.LoginActivity

@Suppress("unused_parameter")
class StartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
    }

    fun jumpToLogin(view: View) {
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }
    fun jumpToRegister(view: View) {
        val intent = Intent(this, RegisterActivity::class.java)
        startActivity(intent)
    }
    fun jumpToRecommend(view: View){
        val intent = Intent(this, RecommendActivity::class.java)
        startActivity(intent)
    }
}