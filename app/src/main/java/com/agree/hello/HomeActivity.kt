package com.agree.hello

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val addDocButton: Button = findViewById(R.id.addDocumentButton)
        val myDocsButton: Button = findViewById(R.id.myDocumentsButton)

        addDocButton.setOnClickListener {
            startActivity(Intent(this, AddDocumentActivity::class.java))
        }

        myDocsButton.setOnClickListener {
            // Later we’ll create DocumentsListActivity
            // For now just show a placeholder
        }
    }
}
