package bootcamp.sparta.similarviewbinding

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.TextView

class SimilarActivityMainBinding(context: Context) : View(context) {
    lateinit var button: Button
    lateinit var tvText: TextView
    lateinit var root: View

    init {
        initRootView()
        binding()
    }

    private fun initRootView() {
        root = LayoutInflater.from(context).inflate(R.layout.activity_main, null, false)
    }

    private fun binding() {
        button = root.findViewById(R.id.button)
        tvText = root.findViewById(R.id.tv_text)
    }
}