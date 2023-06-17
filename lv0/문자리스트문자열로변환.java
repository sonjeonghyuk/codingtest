public class class02 {
    public static void main(String[] args) { // 향상된 for 문 사용
        String[] arr = {"a","b","c"};
        String answer = "";
        for(String s : arr) {
            answer += s;
        }
        System.out.println(answer);

    }
}

/*
* answer = String.join(" + ",arr);       // String.join() 메서드 사용
 */

/*
StringBuilder stringBuilder = new StringBuilder();    // StringBuilder 사용 
        String answer = "";
        for (int i = 0; i < arr.length; i++) {
            stringBuilder.append(arr[i]);
        }
        answer = stringBuilder.toString();
 */
