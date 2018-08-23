package cubex.mahesh.toolbarandmenu_aug7am

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_next.*
import kotlinx.android.synthetic.main.activity_next.view.*

class NextActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)
        setSupportActionBar(tbar)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        tbar.close.setOnClickListener {
            System.exit(0)
        }
    }
}
