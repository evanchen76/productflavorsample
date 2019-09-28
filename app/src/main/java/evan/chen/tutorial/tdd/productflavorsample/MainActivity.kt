package evan.chen.tutorial.tdd.productflavorsample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val repository = Repository()
        val result = repository.getResult()

        textView.text = result

        textView2.text = resources.getString(R.string.name)
    }
}
