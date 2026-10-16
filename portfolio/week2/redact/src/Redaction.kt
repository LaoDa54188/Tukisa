// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string
// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string

fun redact(
    document: String,
    text: String,
    character: Char = 'X'
): String {
    val replacement = character.toString().repeat(text.length)
    return document.replace(text, replacement)
}
