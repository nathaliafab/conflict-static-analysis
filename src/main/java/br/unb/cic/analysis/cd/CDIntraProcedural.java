package br.unb.cic.analysis.cd;

import br.unb.cic.analysis.AbstractMergeConflictDefinition;

import java.util.List;

public class CDIntraProcedural extends CDAnalysisSemanticConflicts {
    public CDIntraProcedural(String classPath, AbstractMergeConflictDefinition definition) {
        super(classPath, definition);
    }

    public CDIntraProcedural(String classPath, AbstractMergeConflictDefinition definition, List<String> entrypoints) {
        super(classPath, definition, entrypoints);
    }

    @Override
    public boolean interprocedural() {
        return false;
    }

}