package demo.jooq.generator.strategy;


import org.jooq.codegen.DefaultGeneratorStrategy;
import org.jooq.meta.Definition;

public final class JPrefixGeneratorStrategy extends DefaultGeneratorStrategy {

    @Override
    public String getJavaClassName(Definition definition, Mode mode) {
        if (mode == Mode.RECORD || mode == Mode.POJO || mode == Mode.DEFAULT) {
            return "J" + super.getJavaClassName(definition, mode);
        }

        return super.getJavaClassName(definition, mode);
    }
}
