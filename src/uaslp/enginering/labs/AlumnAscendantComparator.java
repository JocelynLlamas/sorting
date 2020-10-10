package uaslp.enginering.labs;

public class AlumnAscendantComparator implements Comparator{

    public int compare(Object left, Object right){

        Alumno alumnLeft = (Alumno)left;
        Alumno alumnRight = (Alumno)right;

        //Condicional para el apellido
        if(alumnRight.getLastName().compareTo(alumnLeft.getLastName()) == 0){
            //condicional para el nombre
            if(alumnRight.getFirstName().compareTo(alumnLeft.getFirstName())>0){
                return alumnLeft.getFirstName().compareTo(alumnRight.getFirstName());
            }
            return alumnRight.getLastName().compareTo(alumnLeft.getLastName());
        }else{
            return alumnRight.getLastName().compareTo(alumnLeft.getLastName());
        }
    }
    
}

