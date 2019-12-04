package com.youxu.command;

public abstract class Command {
    protected PageGroup pageGroup = new PageGroup();
    protected CodeGroup codeGroup = new CodeGroup();
    protected RequirementGroup requirementGroup = new RequirementGroup();

    public abstract void execute();
}
