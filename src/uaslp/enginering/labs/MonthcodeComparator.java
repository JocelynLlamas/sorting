package uaslp.enginering.labs;

public class MonthcodeComparator implements Comparator{
//ascendente
    @Override
    public int compare(Object left, Object right){

        Alumno dateLeft = (Alumno)left;
        Alumno dateRight = (Alumno)right;

        if(dateRight.getBirthday().compareTo(dateLeft.getBirthday()) == 0){
            if((dateLeft.getClave()- dateRight.getClave())>0){
                return dateLeft.getClave()-dateRight.getClave();
            }
            return dateRight.getClave() - dateLeft.getClave();
        }else{
            return dateRight.getBirthday().compareTo(dateLeft.getBirthday());
        }
    }

}
