package uaslp.enginering.labs;

public class AlumnDescendantComparator implements Comparator{

    
    public int compare(Object left, Object right){

        Alumno alumnLeft = (Alumno)left;
        Alumno alumnRight = (Alumno)right;

        //Condicional para el apellido
        if(alumnLeft.getLastName().compareTo(alumnRight.getLastName()) == 0){
            //condicional para el nombre
            if(alumnRight.getFirstName().compareTo(alumnLeft.getFirstName())>0){
                return alumnLeft.getFirstName().compareTo(alumnRight.getFirstName());
            }
            return alumnRight.getFirstName().compareTo(alumnLeft.getFirstName());
        }else{
            return alumnLeft.getLastName().compareTo(alumnRight.getLastName());
        }
    }
}
