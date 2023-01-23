package com.example.menudemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.option_menu, menu);
        return true;
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        run {
            return when (item.itemId) {
                R.id.item1 -> {
                    Toast.makeText(this, "item 1 is selected", Toast.LENGTH_SHORT).show();
                    true
                }
                R.id.item2 -> {
                    Toast.makeText(this, "item 2 is selected", Toast.LENGTH_SHORT).show();
                    true
                }
                R.id.item3 -> {
                    Toast.makeText(this, "item 4 is selected", Toast.LENGTH_SHORT).show();
                    true
                }
                R.id.subitem1-> {
                    Toast.makeText(this, "subitem 1 is selected", Toast.LENGTH_SHORT).show();
                    true
                }
                R.id.subitem2 -> {
                    Toast.makeText(this, "subitem 2 is selected", Toast.LENGTH_SHORT).show();
                    true
                }

                else -> super.onOptionsItemSelected(item)
            }
        }

    }
}






