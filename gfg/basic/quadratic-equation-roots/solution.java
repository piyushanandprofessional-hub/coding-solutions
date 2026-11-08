
class Solution {
    public ArrayList<Integer> quadraticRoots(int a, int b, int c) {

        ArrayList<Integer> result = new ArrayList<>();

        double n = (b * b) - (4 * a * c);

        if (n >= 0) {

            double x = (-b + Math.sqrt(n)) / (2.0 * a);
            double y = (-b - Math.sqrt(n)) / (2.0 * a);

            int root1 = (int) Math.floor(Math.max(x, y));
            int root2 = (int) Math.floor(Math.min(x, y));

            result.add(root1);
            result.add(root2);

        } 
        else {
            result.add(-1);
        }

        return result;
    }
}
