package org.example;

public class GridSignalAnalyzer {
    // Mission data
    char[][] scrambledGrid = {
            {'C', 'H', 'A', 'R', 'L', 'I', 'E'},
            {'A', 'L', 'P', 'H', 'A'},
            {'T', 'A', 'N', 'G', 'O', '7'},
            {'B', 'R', 'A', 'V', 'O'}
    };

    // Analyze rows and columns using traditional for loop
    public void analyzeWithForLoop() {
        for (int i = 0; i < scrambledGrid.length; i++) {
            for (int j = 0; j < scrambledGrid[i].length; j++) {
                System.out.print(scrambledGrid[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Analyze rows and columns using for-each loop
    public void analyzeWithForEachLoop() {
        for (char[] rowArray : scrambledGrid) {
            System.out.println("Processing Row with Hash: " + System.identityHashCode(rowArray));
            for (char c : rowArray) {
                System.out.println("-> " + c);
            }
        }
    }

    // Analyze rows with for-each loop and columns with traditional for loop
    public void analyzeWithHybridLoop() {
        for (char[] rowArray : scrambledGrid) {
            for (int i = 0; i < rowArray.length; i++) {
                System.out.print(rowArray[i] + " ");
            }
            System.out.println();
        }
    }
}
