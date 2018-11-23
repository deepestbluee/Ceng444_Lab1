class MyListener extends XPLNParserBaseListener {

    int counter = 0;
    int startCounter = 0;
    int stateF = 0;
    @Override public void exitStart(XPLNParser.StartContext ctx) {
        if(startCounter==0)
        {
            System.out.println("No return value in the Program2");
        } 
    }

    @Override public void exitRet(XPLNParser.RetContext ctx)
    { 
        if(stateF>0)
        {
            counter++;
        }
        else
        {
            startCounter++;
        }   
    }
    @Override public void enterDef(XPLNParser.DefContext ctx)
    {
        stateF = 1;
        counter = 0; 
    }
        
    @Override public void exitDef(XPLNParser.DefContext ctx) {

        if(counter==0)
        {
            System.out.println("No return value in the Function");  
            stateF = 0;     
        } 
    }    

}