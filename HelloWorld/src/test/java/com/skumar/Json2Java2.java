public class MyPojo
{
    private Result Result;

    private AutoProvisionTickets[] AutoProvisionTickets;

    public Result getResult ()
    {
        return Result;
    }

    public void setResult (Result Result)
    {
        this.Result = Result;
    }

    public AutoProvisionTickets[] getAutoProvisionTickets ()
    {
        return AutoProvisionTickets;
    }

    public void setAutoProvisionTickets (AutoProvisionTickets[] AutoProvisionTickets)
    {
        this.AutoProvisionTickets = AutoProvisionTickets;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Result = "+Result+", AutoProvisionTickets = "+AutoProvisionTickets+"]";
    }
}

                
public class TicketAttributes
{
    private String Value;

    private String Key;

    public String getValue ()
    {
        return Value;
    }

    public void setValue (String Value)
    {
        this.Value = Value;
    }

    public String getKey ()
    {
        return Key;
    }

    public void setKey (String Key)
    {
        this.Key = Key;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Value = "+Value+", Key = "+Key+"]";
    }
}

                 
public class Requestor
{
    private String Value;

    private String Key;

    public String getValue ()
    {
        return Value;
    }

    public void setValue (String Value)
    {
        this.Value = Value;
    }

    public String getKey ()
    {
        return Key;
    }

    public void setKey (String Key)
    {
        this.Key = Key;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Value = "+Value+", Key = "+Key+"]";
    }
}
	
public class AutoProvisionTickets
{
    private TicketAttributes[] TicketAttributes;

    private TargetUser[] TargetUser;

    private Requestor[] Requestor;

    private TicketDetails[] TicketDetails;

    public TicketAttributes[] getTicketAttributes ()
    {
        return TicketAttributes;
    }

    public void setTicketAttributes (TicketAttributes[] TicketAttributes)
    {
        this.TicketAttributes = TicketAttributes;
    }

    public TargetUser[] getTargetUser ()
    {
        return TargetUser;
    }

    public void setTargetUser (TargetUser[] TargetUser)
    {
        this.TargetUser = TargetUser;
    }

    public Requestor[] getRequestor ()
    {
        return Requestor;
    }

    public void setRequestor (Requestor[] Requestor)
    {
        this.Requestor = Requestor;
    }

    public TicketDetails[] getTicketDetails ()
    {
        return TicketDetails;
    }

    public void setTicketDetails (TicketDetails[] TicketDetails)
    {
        this.TicketDetails = TicketDetails;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [TicketAttributes = "+TicketAttributes+", TargetUser = "+TargetUser+", Requestor = "+Requestor+", TicketDetails = "+TicketDetails+"]";
    }
}

public class TicketAttributes
{
    private String Value;

    private String Key;

    public String getValue ()
    {
        return Value;
    }

    public void setValue (String Value)
    {
        this.Value = Value;
    }

    public String getKey ()
    {
        return Key;
    }

    public void setKey (String Key)
    {
        this.Key = Key;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Value = "+Value+", Key = "+Key+"]";
    }
}


public class TargetUser
{
    private String Value;

    private String Key;

    public String getValue ()
    {
        return Value;
    }

    public void setValue (String Value)
    {
        this.Value = Value;
    }

    public String getKey ()
    {
        return Key;
    }

    public void setKey (String Key)
    {
        this.Key = Key;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Value = "+Value+", Key = "+Key+"]";
    }
}

public class Requestor
{
    private String Value;

    private String Key;

    public String getValue ()
    {
        return Value;
    }

    public void setValue (String Value)
    {
        this.Value = Value;
    }

    public String getKey ()
    {
        return Key;
    }

    public void setKey (String Key)
    {
        this.Key = Key;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Value = "+Value+", Key = "+Key+"]";
    }
}


public class TicketDetails
{
    private String Value;

    private String Key;

    public String getValue ()
    {
        return Value;
    }

    public void setValue (String Value)
    {
        this.Value = Value;
    }

    public String getKey ()
    {
        return Key;
    }

    public void setKey (String Key)
    {
        this.Key = Key;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Value = "+Value+", Key = "+Key+"]";
    }
}


public class Result
{
    private String ResultDescription;

    private String ResultCode;

    private String TotalTicketCount;

    public String getResultDescription ()
    {
        return ResultDescription;
    }

    public void setResultDescription (String ResultDescription)
    {
        this.ResultDescription = ResultDescription;
    }

    public String getResultCode ()
    {
        return ResultCode;
    }

    public void setResultCode (String ResultCode)
    {
        this.ResultCode = ResultCode;
    }

    public String getTotalTicketCount ()
    {
        return TotalTicketCount;
    }

    public void setTotalTicketCount (String TotalTicketCount)
    {
        this.TotalTicketCount = TotalTicketCount;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [ResultDescription = "+ResultDescription+", ResultCode = "+ResultCode+", TotalTicketCount = "+TotalTicketCount+"]";
    }
}