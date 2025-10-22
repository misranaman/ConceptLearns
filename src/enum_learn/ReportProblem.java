package enum_learn;

public enum ReportProblem {

    REPORT_A_BUG("Report an app related problem/bug"),
    SESSION_ISSUE("Session related problem"),
    PROVIDER_ISSUE("Provider related problem"),
    BILLING_ISSUE("Billing or Payment issue"),
    OTHERS("Any other issue");

    private String problem;

    ReportProblem(String problem) {
        this.problem = problem;
    }

    public String problem(){
        return this.problem;
    }

}
