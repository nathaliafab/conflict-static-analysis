package br.unb.cic.analysis.dfp;

import br.unb.cic.analysis.AbstractMergeConflictDefinition;
import scala.collection.JavaConverters;

import java.util.Arrays;
import java.util.List;

public class DFPIntraProcedural extends DFPAnalysisSemanticConflicts {
    public DFPIntraProcedural(String classPath, AbstractMergeConflictDefinition definition) {
        super(classPath, definition);
    }

    public DFPIntraProcedural(String classPath, AbstractMergeConflictDefinition definition, List<String> entrypoints) {
        super(classPath, definition, entrypoints);
    }

    @Override
    public boolean interprocedural() {
        return false;
    }

    @Override
    public scala.collection.immutable.List<String> getIncludeList() {
        return JavaConverters.asScalaBuffer(Arrays.asList("")).toList();
    }
}