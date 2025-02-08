
import java.util.List;
import java.util.Objects;

public class MajoritaryElement {


    public static void main(String[] args) {
        
        
        List<Integer> elementsArray;
        
        elementsArray = List.of(3,2,3);
        
        int count = 0;
        int result = 0;


        
        List<Integer> distinctElements;

        distinctElements = elementsArray.stream().distinct().toList();

        for (Integer distinctElement : distinctElements) {

            for (int j = 0; j < elementsArray.size(); j++) {

                if (Objects.equals(elementsArray.get(j), distinctElement)) {

                    count++;

                    if (count == Math.round(elementsArray.size() / 2f)) {

                        result = elementsArray.get(j);
                    }


                }


            }

            count = 0;


        }

        if(result == 0) {

            System.out.println("-1");

        }else{
            System.out.println(result);
        }




        
        
    }
    
}
