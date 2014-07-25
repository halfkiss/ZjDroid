package com.android.reverse.apimonitor;



public class ApiMonitorHookManager {
	
	private static ApiMonitorHookManager hookmger;
	private SmsManagerHook smsManagerHook;
	private TelephonyManagerHook telephonyManagerHook;
	private MediaRecorderHook mediaRecorderHook;
	private AccountManagerHook accountManagerHook;
	private ActivityManagerHook activityManagerHook;
	private AlarmManagerHook alarmManagerHook;
	private ConnectivityManagerHook connectivityManagerHook;
	private ContentResolverHook contentResolverHook;
	private ContextImplHook contextImplHook;
	private PackageManagerHook packageManagerHook;
	private RuntimeHook runtimeHook;
	private ActivityThreadHook activityThreadHook;
	private AudioRecordHook audioRecordHook;
	private CameraHook cameraHook;
	private NetWorkHook networkHook;
	private NotificationManagerHook notificationManagerHook;
	private ProcessBuilderHook processBuilderHook;
	
	
	private ApiMonitorHookManager(){
		this.smsManagerHook = new SmsManagerHook();	
		this.telephonyManagerHook = new TelephonyManagerHook();
		this.mediaRecorderHook = new MediaRecorderHook();
		this.accountManagerHook = new AccountManagerHook();
		this.activityManagerHook = new ActivityManagerHook();
		this.alarmManagerHook= new AlarmManagerHook();
		this.connectivityManagerHook = new ConnectivityManagerHook();
		this.contentResolverHook = new ContentResolverHook();
		this.contextImplHook = new ContextImplHook();
		this.packageManagerHook = new PackageManagerHook();
		this.runtimeHook = new RuntimeHook();
		this.activityThreadHook = new ActivityThreadHook();
		this.audioRecordHook = new AudioRecordHook();
		this.cameraHook = new CameraHook();
		this.networkHook = new NetWorkHook();
		this.notificationManagerHook = new NotificationManagerHook();
		this.processBuilderHook = new ProcessBuilderHook();
	}
	
	public static ApiMonitorHookManager getInstance(){
		if(hookmger == null)
			hookmger = new ApiMonitorHookManager();
		return hookmger;
	}
	
	public void startMonitor(){
		this.smsManagerHook.startHook();
		this.telephonyManagerHook.startHook();
		this.mediaRecorderHook.startHook();
		this.accountManagerHook.startHook();
		this.activityManagerHook.startHook();
		this.alarmManagerHook.startHook();
		this.connectivityManagerHook.startHook();
        this.contentResolverHook.startHook();
        this.contextImplHook.startHook();
        this.packageManagerHook.startHook();
        this.runtimeHook.startHook();
		this.activityThreadHook.startHook();
		this.audioRecordHook.startHook();
		this.cameraHook.startHook();
		this.networkHook.startHook();
		this.notificationManagerHook.startHook();
		this.processBuilderHook.startHook();
	}

}
