import javax.print.DocFlavor;
import java.util.*;



public class qwer {

    public static void main(String[] args) {

        Map<String, Map<String, String>> MapStorage = new HashMap<>();
        LinkedList<LinkedList<String>> MapKeyStorage = new LinkedList<>();
        LinkedList<String> boardKeyStorage = new LinkedList<>();



        MapStorage.put("자유게시판", new HashMap<>());
        MapStorage.put("정보게시판", MapStorage.get("자유게시판"));
        MapStorage.remove("자유게시판");


        MapStorage.get("정보게시판").put("제목1","내용1");
        System.out.println(MapStorage.get("정보게시판"));




/*
        LinkedList<LinkedList<String>> MapKeyStorage = new LinkedList<>();
        System.out.println(MapKeyStorage.size());;
        MapKeyStorage.add(new LinkedList<>());
        System.out.println(MapKeyStorage.size());;
        MapKeyStorage.remove(0);
        System.out.println(MapKeyStorage.size());;      */

        /*LinkedList<LinkedList<String>> MapKeyStorage = new LinkedList<>();
        MapKeyStorage.add(new LinkedList<>());
        MapKeyStorage.get(0).add("짱짱");
        System.out.println(MapKeyStorage.get(0).get(0));*/

        /*LinkedList<String> aaa = new LinkedList<>();
        aaa.add("1입니다");*/

        /*LinkedList<Map<String, String>> MapStorage = new LinkedList<>(); //
        MapStorage.add(new HashMap<>());
        MapStorage.get(0).put("제목1","내용1");
        System.out.println(MapStorage.get(0).get("제목1"));*/


        /*Scanner sc = new Scanner(System.in);
        String userInput;
        String[] userInputPath;// userInput을 split 한 경로 문자열 저장용.
        String[] userInputCrud; // split한 경로 문자열에서 파라미터부분을 따로 또 분리해서 그것을 저장할 용도.
        String[] userInputParameter;
        String[] userInputParameterSplit;

        userInput = sc.nextLine();
        userInputPath = userInput.split("="); // 유저의 입력중에 "/"를 기준으로 나눠서 저장함.
        // 예시 입력값=> /boards/add?parameter=10&b=value...
        // userInputPath[0] => 빈 부분
        // userInputPath[1] => boards 부분
        // userInputPath[2] => add?parameter=10&b=value... 부분

        System.out.println(userInputPath.length);
        System.out.println(userInputPath[0]);
        System.out.println(userInputPath[1]);
        System.out.println(userInputPath[2]);*/







        /*Scanner sc = new Scanner(System.in);
        String userInput;
        userInput = sc.nextLine();
        LinkedList<String> keyIndexStorage = new LinkedList<>();
        keyIndexStorage.add("a");
        keyIndexStorage.add("b");
        keyIndexStorage.add("c");
        System.out.println(keyIndexStorage.get(0));
        System.out.println(keyIndexStorage.indexOf("a"));*/





        /*Integer.parseInt(userInput);
        System.out.println(userInput);*/




        Map<String, String> boardStorage = new HashMap<>();
        Deque<String> dequeStorage = new LinkedList<>();
        Stack<String> stackStorage = new Stack<>();


        /*int a = 1;
        String b = (a+"번");
        String c = (a+"번");
        boolean d = b == c;
        System.out.println("d = " + d);*/

       /* System.out.println(   b  );
        System.out.println(   (a+"번")   );*/



        /*if(userInput == (a+"번") && a>=1){
            System.out.println("축하햐");
        }
        else{
            System.out.println("비완벽적인 실행");
        }*/

        /*String[] userReadIndex;
        userInput = sc.nextLine();
        userReadIndex = userInput.split("번");
        System.out.println(userReadIndex[0]);
        System.out.println(userReadIndex[0].getClass()); //String
        System.out.println(userReadIndex[0].getClass().getName()); //
        System.out.println(userReadIndex[1]);
        Integer q = Integer.parseInt(userReadIndex[0]);
        System.out.println(q.getClass());
        System.out.println(q.getClass().getName());
        System.out.println(q);*/


        /*Map<String, String> storage = new HashMap<>();
        storage.put("제목1", "내용내용내용1");
        storage.put("제목2", "내용내용내용2");
        System.out.println(storage.get("제목1"));
        System.out.println(storage.get("제목2"));*/

       /*Stack<String> storage2 = new Stack<>(); // 여기 저장되면 제일 마지막에 들어간 값을 꺼낼수있음.
        storage2.push("aaa");
        storage2.push("bbb");
        storage2.push("ccc");
        System.out.println(storage2.peek());
        //storage2.pop();
       // System.out.println(storage2.peek()); //bbb
        System.out.println(storage2.indexOf("bbb"));
        System.out.println(storage2.indexOf("ccc"));
        storage2.remove("bbb");
        System.out.println(storage2.indexOf("ccc"));*/


        //System.out.println("테스트 :" + (1+2) +"=3");


       /*Deque<String> qq1 = new LinkedList<>();
        qq1.add("1");
        qq1.add("2");
        qq1.add("3");



        System.out.println(qq1.getFirst());;*/

        /*Map<String, String> boardStorage = new HashMap<>();
        boardStorage.put("A", "1");
        boardStorage.put("B", "2");
        boardStorage.put("C", "3");
        boardStorage.put("D", "4");
        boardStorage.put("E", "5");
        System.out.println(boardStorage.get("C"));; //3
        boardStorage.remove("E");
        System.out.println(boardStorage.get("E"));
        System.out.println(boardStorage.values());
        */

        /*LinkedList<String> qq1 = new LinkedList<>();

        qq1.add("a");
        qq1.add("b");
        qq1.add("c");
        qq1.add("d");
        qq1.add("e");
        System.out.println(qq1.get(2));*/

    }

    public void test1(){

    }

}