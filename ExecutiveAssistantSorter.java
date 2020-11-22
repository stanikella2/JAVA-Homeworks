import java.util.Scanner;

public class ExecutiveAssistantSorter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // get number of lines
        int n = Integer.parseInt(sc.nextLine());
        
        // for each line, create an ExecutiveAssistant object
        ExecutiveAssistant[] candidates = new ExecutiveAssistant[n];
        for (int i = 0; i < n; i++) {
            // Parse a list of properties
            String line = sc.nextLine();
            String[] properties = line.split(" ");
                
            // add a new ExecutiveAssistant to the array
            candidates[i] = new ExecutiveAssistant(
                /* firstName */ properties[0],
                /* lastName */ properties[1],
                /* organizationScore */ Integer.parseInt(properties[2]),
                /* punctualityScore */ Integer.parseInt(properties[3])
            );
        }
        
        // sort the ExecutiveAssistant objects
        mergeSort(candidates);
        
        // print the candidate names
        for (int i = 0; i < n; i++) {
            System.out.println(candidates[i]);
        }
    }
    
    private static void mergeSort(ExecutiveAssistant[] candidates) {
        mergeSortRec(candidates, 0, candidates.length - 1);
    }
    
    private static void mergeSortRec(ExecutiveAssistant[] candidates,
                                     int startIndex, int endIndex) {
        // base case
        if (startIndex >= endIndex) {
            return;
        }

        // sort each half
        int middleIndex = (startIndex + endIndex) / 2;
        mergeSortRec(candidates, startIndex, middleIndex);
        mergeSortRec(candidates, middleIndex+1, endIndex);

        // merge halves
        merge(candidates, startIndex, middleIndex, endIndex);
    }

    private static void merge(ExecutiveAssistant[] candidates,
                              int startIndex, int middleIndex, int endIndex) {
        // Declare separate arrays for the first list and the second list
        ExecutiveAssistant[] firstHalf =
                new ExecutiveAssistant[middleIndex - startIndex + 1];
        ExecutiveAssistant[] secondHalf =
                new ExecutiveAssistant[endIndex - middleIndex];

        // populate first half list
        for (int i = startIndex; i < middleIndex + 1; i++) {
            firstHalf[i-startIndex] = candidates[i];
        }

        // populate second half list
        for (int i = middleIndex + 1; i <= endIndex; i++) {
            secondHalf[i-middleIndex-1] = candidates[i];
        }

        // here, we keep tracking pointers for each list
        int firstHalfPointer = 0;
        int secondHalfPointer = 0;

        // populate the original list with merged elements
        for (int i = startIndex; i <= endIndex; i++) {
            // check for out-of-bounds
            if (firstHalfPointer >= firstHalf.length) {
                candidates[i] = secondHalf[secondHalfPointer];
                secondHalfPointer++;
                continue;
            }
            if (secondHalfPointer >= secondHalf.length) {
                candidates[i] = firstHalf[firstHalfPointer];
                firstHalfPointer++;
                continue;
            }

            // populate with smaller of the two elements
            double firstCandidateJobSuitabilityScore =
                    firstHalf[firstHalfPointer].getJobSuitabilityScore();
            double secondCandidateJobSuitabilityScore =
                    secondHalf[secondHalfPointer].getJobSuitabilityScore();
            if (firstCandidateJobSuitabilityScore >= secondCandidateJobSuitabilityScore) {
                candidates[i] = firstHalf[firstHalfPointer];
                firstHalfPointer++;
            } else {
                candidates[i] = secondHalf[secondHalfPointer];;
                secondHalfPointer++;
            }
        }
    }
}