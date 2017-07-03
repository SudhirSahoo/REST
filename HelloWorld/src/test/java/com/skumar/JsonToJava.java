public class Result
{
  private int ResultCode;

  public int getResultCode() { return this.ResultCode; }

  public void setResultCode(int ResultCode) { this.ResultCode = ResultCode; }

  private String ResultDescription;

  public String getResultDescription() { return this.ResultDescription; }

  public void setResultDescription(String ResultDescription) { this.ResultDescription = ResultDescription; }

  private int TotalTicketCount;

  public int getTotalTicketCount() { return this.TotalTicketCount; }

  public void setTotalTicketCount(int TotalTicketCount) { this.TotalTicketCount = TotalTicketCount; }
}

public class TicketDetail
{
  private String Key;

  public String getKey() { return this.Key; }

  public void setKey(String Key) { this.Key = Key; }

  private String Value;

  public String getValue() { return this.Value; }

  public void setValue(String Value) { this.Value = Value; }
}

public class Requestor
{
  private String Key;

  public String getKey() { return this.Key; }

  public void setKey(String Key) { this.Key = Key; }

  private String Value;

  public String getValue() { return this.Value; }

  public void setValue(String Value) { this.Value = Value; }
}

public class TargetUser
{
  private String Key;

  public String getKey() { return this.Key; }

  public void setKey(String Key) { this.Key = Key; }

  private String Value;

  public String getValue() { return this.Value; }

  public void setValue(String Value) { this.Value = Value; }
}

public class TicketAttribute
{
  private String Key;

  public String getKey() { return this.Key; }

  public void setKey(String Key) { this.Key = Key; }

  private String Value;

  public String getValue() { return this.Value; }

  public void setValue(String Value) { this.Value = Value; }
}

public class AutoProvisionTicket
{
  private ArrayList<TicketDetail> TicketDetails;

  public ArrayList<TicketDetail> getTicketDetails() { return this.TicketDetails; }

  public void setTicketDetails(ArrayList<TicketDetail> TicketDetails) { this.TicketDetails = TicketDetails; }

  private ArrayList<Requestor> Requestor;

  public ArrayList<Requestor> getRequestor() { return this.Requestor; }

  public void setRequestor(ArrayList<Requestor> Requestor) { this.Requestor = Requestor; }

  private ArrayList<TargetUser> TargetUser;

  public ArrayList<TargetUser> getTargetUser() { return this.TargetUser; }

  public void setTargetUser(ArrayList<TargetUser> TargetUser) { this.TargetUser = TargetUser; }

  private ArrayList<TicketAttribute> TicketAttributes;

  public ArrayList<TicketAttribute> getTicketAttributes() { return this.TicketAttributes; }

  public void setTicketAttributes(ArrayList<TicketAttribute> TicketAttributes) { this.TicketAttributes = TicketAttributes; }
}

public class RootObject
{
  private Result Result;

  public Result getResult() { return this.Result; }

  public void setResult(Result Result) { this.Result = Result; }

  private ArrayList<AutoProvisionTicket> AutoProvisionTickets;

  public ArrayList<AutoProvisionTicket> getAutoProvisionTickets() { return this.AutoProvisionTickets; }

  public void setAutoProvisionTickets(ArrayList<AutoProvisionTicket> AutoProvisionTickets) { this.AutoProvisionTickets = AutoProvisionTickets; }
}