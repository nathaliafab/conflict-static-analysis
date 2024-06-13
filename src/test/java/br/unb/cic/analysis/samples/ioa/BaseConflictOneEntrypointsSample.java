package br.unb.cic.analysis.samples.ioa;

// Conflict: [left, countDupWords():22] --> [right, countDupWhitespace():30]
public class BaseConflictOneEntrypointsSample {

    public String text;
    public int fixes, comments;

    public void main() {
        BaseConflictOneEntrypointsSample baseConflictSample = new BaseConflictOneEntrypointsSample();
        baseConflictSample.countDupWhitespace(); //RIGHT
        baseConflictSample.countFixes();
    }

    public int countFixes() {
        countComments();
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