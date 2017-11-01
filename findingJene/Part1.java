//import edu.duke.*;

public class Part1{
    public String findSimpleGene(String dna){
        
        String result = " ";
        int startIndex = dna.indexOf("ATG");
        //if (startIndex == -1){
           //return ""; 
       // }
        int stopIndex = dna.indexOf("TAA", startIndex+3);
        while(stopIndex != -1){
            if ((stopIndex - startIndex) % 3 == 0){
                return dna.substring(startIndex, stopIndex+3);
            }
            else {
                stopIndex = dna.indexOf("TAA",stopIndex +1);
            }
        }
        //if(stopIndex == -1){
           // return  "";
       // }
       // result = dna.substring(startIndex, stopIndex+3);
        
        //return result;
        return "";
    
    }




   public void testGene(){
    String dna = "AATGCGTTAAGGTTCTAAGTAATATGATGATGACATACCTAVTAAATGATGA";
    System.out.println("DNA strand is:" + dna);
    String gene = findSimpleGene(dna);
    System.out.println("Gene is : " + gene);
       
    dna = "ATGTAA";
    System.out.println("DNA strand is:" + dna);
    gene = findSimpleGene(dna);
    System.out.println("Gene is : " + gene);
    
    dna = "TAATAA";
    System.out.println("DNA strand is:" + dna);
    gene = findSimpleGene(dna);
    System.out.println("Gene is : " + gene);
    
    dna = "CGATGGTTTG";
    System.out.println("DNA strand is:" + dna);
    gene = findSimpleGene(dna);
    System.out.println("Gene is : " + gene);





   }
}   
