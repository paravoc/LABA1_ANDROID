package smirnov_daniil.is_b22.laba1

class TextFormatter {
    private val predefinedText = ""

    // получить текст
    fun getPredefinedText(): String {
        return predefinedText
    }

    //функция сортировки
    fun sortWordsByLength(): String {
        return try {
            predefinedText.split(" ")
                .sortedByDescending { it.length }
                .joinToString(" ")
        } catch (e: Exception) {
            "Ошибка при обработке текста"
        }
    }

}