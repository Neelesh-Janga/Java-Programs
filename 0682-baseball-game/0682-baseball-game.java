class Solution {
    public int calPoints(String[] operations) {
        int[] list = new int[operations.length];
        int sum = 0, i = 0, index = 0;

        while (index < operations.length){
            String str = operations[index++];

            switch(str){
                case "C" -> {
                    list[i---1] = 0;
                    i--;
                }
                case "D" -> list[i] = list[i-1] * 2;
                case "+" -> list[i] = list[i-1] + list[i-2];
                default ->  list[i] = Integer.parseInt(str);
            }

            i++;
        }

        for(int j: list){
            sum += j;
        }

        return sum;
    }
}