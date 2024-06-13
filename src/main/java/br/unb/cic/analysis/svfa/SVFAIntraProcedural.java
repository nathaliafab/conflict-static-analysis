package br.unb.cic.analysis.svfa;

import br.unb.cic.analysis.AbstractMergeConflictDefinition;

import java.util.List;

public class SVFAIntraProcedural extends SVFAAnalysis {
    public SVFAIntraProcedural(String classPath, AbstractMergeConflictDefinition definition) {
        super(classPath, definition);
    }

    public SVFAIntraProcedural(String classPath, AbstractMergeConflictDefinition definition, List<String> entrypoints) {
        super(classPath, definition, entrypoints);
    }

    @Override
    public boolean interprocedural() {
        return false;
    }

    @Override
    public boolean propagateObjectTaint() {
        return false;
    }
}