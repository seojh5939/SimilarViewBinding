package bootcamp.sparta.similarviewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    val binding : SimilarActivityMainBinding by lazy { SimilarActivityMainBinding(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.button.setOnClickListener {
            binding.tvText.text = "뷰바인딩 비스무리 성공!?!?"
        }
    }
}