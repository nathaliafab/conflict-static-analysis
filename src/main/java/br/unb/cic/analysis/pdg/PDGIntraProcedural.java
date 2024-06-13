package br.unb.cic.analysis.pdg;

import br.unb.cic.analysis.AbstractMergeConflictDefinition;

import java.util.List;

public class PDGIntraProcedural extends PDGAnalysisSemanticConflicts {
    public PDGIntraProcedural(String classPath, AbstractMergeConflictDefinition definition) {
        super(classPath, definition);
    }

    public PDGIntraProcedural(String classPath, AbstractMergeConflictDefinition definition, List<String> entrypoints) {
        super(classPath, definition, entrypoints);
    }

    @Override
    public boolean interprocedural() {
        return false;
    }

}