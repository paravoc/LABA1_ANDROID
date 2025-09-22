package smirnov_daniil.is_b22.laba1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var resultTextView: TextView
    private val textFormatter = TextFormatter()  // Создаем экземпляр класса

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Находим элементы на экране
        resultTextView = findViewById(R.id.resultTextView)
        val processButton = findViewById<Button>(R.id.processButton)
        val inputEditText = findViewById<EditText>(R.id.inputEditText)

        // Показываем строку
        inputEditText.setText(textFormatter.getPredefinedText())

        // Обработка нажатия кнопки
        processButton.setOnClickListener {
            val sortedText = textFormatter.sortWordsByLength()
            resultTextView.text = sortedText
        }
    }
}