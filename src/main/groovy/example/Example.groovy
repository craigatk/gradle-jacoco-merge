package example

class Example {
    String foo(boolean first) {
        if (first) { // Covered
            return "A" // Covered
        }

        return "B" // Covered
    }

    String bar(boolean first) {
        if (first) { // Partial
            return "C" // Covered
        }

        return "D" // Missed
    }

    String baz(boolean first) {
        if (first) { // Partial
            return "E" // Covered
        }

        return "F" // Missed
    }
}
