import java.util.*;

public class UserInput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String userInput;

        Map<String, String> boardStorage = new HashMap<>();

        Deque<String> dequeStorage = new LinkedList<>();

        do { System.out.print("명령어 > ");
            userInput = sc.nextLine();

            if ( !userInput.equals("종료")){

                if(userInput.equals("작성")){
                    System.out.print("제목을 작성해주세요:");
                    userInput = sc.nextLine();
                    dequeStorage.add(userInput); // 디큐에 제목 저장
                    System.out.println("작성한 제목이 저장되었습니다.");
                    System.out.print("내용을 작성해주세요:");
                    userInput = sc.nextLine();
                    dequeStorage.add(userInput); //디큐에 내용 저장
                    boardStorage.put(dequeStorage.getFirst(), dequeStorage.getLast()); //Map에 제목(키), 내용(밸류) 로 저장.
                    dequeStorage.removeAll(dequeStorage); // 디큐 내용삭제. 작성 명령어가 끝난뒤 다시 작성으로 진입하면 나중에 dequeStorage 에서 값을 꺼내서 Map에 저장할때 다른것이 저장되기때문.
                    System.out.println("작성한 내용이 저장되었습니다.");
                    System.out.println(boardStorage.get("제목1"));

                }

                else{
                    System.out.println("존재하지 않는 명령어 입니다.");
                }
            }

        } while( !userInput.equals("종료") );

        System.out.println("프로그램이 종료됩니다.");
    }

}
