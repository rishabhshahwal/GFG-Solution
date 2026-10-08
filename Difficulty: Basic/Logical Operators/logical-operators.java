class Solution {
    public String booleanOperations(boolean a, boolean b) {
        boolean andResult = a && b;
        boolean orResult = a || b;
        boolean notResult = !a;

        return andResult + " " + orResult + " " + notResult;
    }
}