package com.lll2yu.comicsreader

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.amnix.adblockwebview.ui.AdBlocksWebViewActivity

class ComicActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comic)
        AdBlocksWebViewActivity.init(this)
        AdBlocksWebViewActivity.startWebView(this,"readcomics.website",2)
    }
}
