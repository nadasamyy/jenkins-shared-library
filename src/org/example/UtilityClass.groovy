package org.example

class UtilityClass {
    /**
     * Prints a message to the Jenkins console.
     * 
     * @param message The message to print.
     */
    static void printMessage(String message) {
        echo "Utility Message: ${message}"
    }

    /**
     * Returns a formatted string with a prefix.
     * 
     * @param prefix The prefix to add.
     * @param text   The main text.
     * @return A formatted string.
     */
    static String formatText(String prefix, String text) {
        return "${prefix}: ${text}"
    }

    /**
     * Validates if a given string is not empty.
     * 
     * @param input The string to validate.
     * @return True if the string is not empty, false otherwise.
     */
    static boolean validateInput(String input) {
        return input?.trim()
    }
}
