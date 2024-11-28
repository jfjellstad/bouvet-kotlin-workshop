package no.bouvet._00nullability

data class Client(val personalInfo: PersonalInfo?)
data class PersonalInfo(val email: String?)

interface Mailer {
    fun sendMessage(email: String, message: String)
}

/*
Rewrite Java method 'MessageUtil.sendMessageToClient' in Kotlin in 2-3 lines.
*/
fun sendMessageToClient(client: Client?, message: String?, mailer: Mailer) {
    TODO()
}