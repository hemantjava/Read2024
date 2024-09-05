package org.dsa.interview.other;

public class CallByValue {
    public static void main(String[] args) {
        int a = 15;
        updatePrimitive(a); // copy value 15 pass value and call
        System.out.println(a);//15 No change //original value

        StringBuilder name = new StringBuilder("Hemant"); // object creation and addressed in memory
        updateReference(name);//copy reference value    both copy and original object addressed same memory
        System.out.println(name);// Hemant sahu // change

        String nameStr = "Hemant";
        updateImmutableString(nameStr); // Not applicable for immutable reference type
        System.out.println(nameStr); // hemant
    }

    private static void updateImmutableString(String nameStr) {
        nameStr = nameStr+" sahu";
    }

    private static void updateReference(StringBuilder name) {
        name.append(" sahu");
    }

    private static void updatePrimitive(int a) {
        a = 20;
    }


}
