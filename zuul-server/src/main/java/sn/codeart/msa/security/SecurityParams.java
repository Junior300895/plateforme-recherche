package sn.codeart.msa.security;

public interface SecurityParams {
    public static final String JWT_HEADER_NAME="Authorization";
    public static final String SECRET="med@youssfi.net";
    public static final long EXPIRATION=48*3600*1000; //48h
    //public static final long EXPIRATION=15*60*1000;
    public static final String HEADER_PREFIX="Bearer ";
}
