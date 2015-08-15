package one;


public class StandingOvation {
    public static int compute(int maximumShyness, int data)
    {

        int[] people = generatePeople(data, maximumShyness);

        int count = 0  ;
        int peopleClapping  = 0 ;

        for(int i = 0 ; i < people.length ; i++)
        {
            if(peopleClapping>= i){
                peopleClapping = peopleClapping + people[i] ;
            }
            else
            {

                int needed = i - peopleClapping;
                count = count + needed;
                peopleClapping = peopleClapping + needed + people[i];

            }
        }



        return count ;
    }

    private static int[] generatePeople(int data, int maximumShyness) {
        int[] people = new int[maximumShyness+1] ;
        int index = maximumShyness ;

        while(data>0)
        {
            int digit = data % 10 ;
            data = data/10 ;
            people[index] = digit ;
            index-- ;
        }
        return people ;
    }
}
