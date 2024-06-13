package br.unb.cic.analysis.svfa;

import br.unb.cic.analysis.AbstractMergeConflictDefinition;

import java.util.List;

public class SVFAInterProcedural extends SVFAAnalysis {
    public SVFAInterProcedural(String classPath, AbstractMergeConflictDefinition definition) {
        super(classPath, definition);
    }

    public SVFAInterProcedural(String classPath, AbstractMergeConflictDefinition definition, List<String> entrypoints) {
        super(classPath, definition, entrypoints);
    }

    @Override
    public boolean interprocedural() {
        return true;
    }

    @Override
    public boolean propagateObjectTaint() {
        return true;
    }
}