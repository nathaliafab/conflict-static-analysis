package br.unb.cic.analysis.samples.ioa;

// Conflict: [left, countDupWords():22] --> [right, countDupWhitespace():30]
public class BaseConflictTwoEntrypointsSample {

    public String text;
    public int fixes, comments;

    public void main(String[] args) {
        BaseConflictTwoEntrypointsSample baseConflictSample = new BaseConflictTwoEntrypointsSample();
        baseConflictSample.countDupWhitespace(); //RIGHT
        baseConflictSample.countFixes();
    }

    public int countFixes() {
        countComments(); // RIGHT
        int a = 1; // BASE
        countDupWords(); // LEFT
        return fixes;
    }

    private void countDupWords() {
        fixes = fixes + 2;
    }

    private void countComments() {
        comments = comments + 1;
    }

    private void countDupWhitespace() {
        fixes = fixes + 1;
    }
}