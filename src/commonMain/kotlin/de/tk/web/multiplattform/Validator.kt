package de.tk.web.multiplattform

interface Validator {

    fun validate(data:String): String

}


class DefaultValidator : Validator {
    override fun validate(data: String): String {
        if (data == "good") {
            return "alles ok"
        } else {
            return "nix geht hier"
        }
    }

}
