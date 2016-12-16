package md5339775d3902edb8bf1469e65b89dde0a;


public class BarChartActivity
	extends android.app.Activity
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\n" +
			"";
		mono.android.Runtime.register ("Xamarin_Android_MPChart_Example2.BarChartActivity, Xamarin Android MPChart Example2, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", BarChartActivity.class, __md_methods);
	}


	public BarChartActivity () throws java.lang.Throwable
	{
		super ();
		if (getClass () == BarChartActivity.class)
			mono.android.TypeManager.Activate ("Xamarin_Android_MPChart_Example2.BarChartActivity, Xamarin Android MPChart Example2, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onCreate (android.os.Bundle p0)
	{
		n_onCreate (p0);
	}

	private native void n_onCreate (android.os.Bundle p0);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
