package com.example.inpp

import android.app.SearchManager
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.security.Key
import javax.security.auth.Subject


const val KEY_1= "Name"
const val KEY_ID="Id"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnExp.setOnClickListener(View.OnClickListener {
            val i = Intent(this,explicitIntent::class.java)
            val name = name.text.toString()
            val id1 = id.text.toString().toInt()
            i.putExtra(KEY_1,name)
            i.putExtra(KEY_ID,id1)
            startActivity(i)
        })


        btnMail.setOnClickListener(View.OnClickListener {
            val email = mail.text.toString()
            val m = Intent()
            m.action = Intent.ACTION_SENDTO
            m.data = Uri.parse("mailto:$email")
            m.putExtra(Intent.EXTRA_SUBJECT,"Implicit Inent")
            startActivity(m)
        })

        btnSearch.setOnClickListener(View.OnClickListener {
            val search = search.text.toString()
            val s = Intent(Intent.ACTION_WEB_SEARCH)
            //val s = Intent(Intent.ACTION_VIEW)
            //s.data = Uri.parse("$search")
            s.putExtra(SearchManager.QUERY,search)
            startActivity(s)
        })

        btnNum.setOnClickListener(View.OnClickListener {
            val num = dial.text.toString()
            val d = Intent(Intent.ACTION_DIAL)
            d.data = Uri.parse("tel:$num")
            startActivity(d)
        })

    }
}