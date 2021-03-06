

package Model.command.ArgumentParsing.argTypes;

import Model.command.ArgumentParsing.ArgumentException;
import Model.command.ArgumentParsing.ArgumentParser;
import java.util.List;
import Model.command.ArgumentParsing.ArgumentTypeParser;

public class StringParser implements ArgumentTypeParser
{
    private final Integer stringPos;
    private final Integer argsNeeded;
    
    public StringParser() {
        this.stringPos = 0;
        this.argsNeeded = 1;
    }
    
    @Override
    public Boolean matchType(final String argument) {
        return argument.matches("\".*\"");
    }
    
    @Override
    public Object parseArg(final List<String> args, final ArgumentParser parser) throws ArgumentException {
        return args.get(this.stringPos).replace("\"", "").toLowerCase();
    }
    
    @Override
    public Integer totalArgsNeeded() {
        return this.argsNeeded;
    }
}
