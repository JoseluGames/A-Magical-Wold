package com.jlgm.amw.main;

import com.jlgm.amw.lib.AMWConstants;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = AMWConstants.MODID,
	name = AMWConstants.NAME,
	version = AMWConstants.VERSION,
	acceptedMinecraftVersions = AMWConstants.ACCEPTEDMINECRAFTVERSIONS)

public class AMWMain {
	
	@SidedProxy(clientSide = AMWConstants.CLIENT_PROXY, serverSide = AMWConstants.SERVER_PROXY)
	public static CommonProxy proxy;
	@Instance("AMagicalWorld")
	public static AMWMain instance;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent preInitEvent){
		proxy.preInit(preInitEvent);
	}
	
	@EventHandler
	public static void Init(FMLInitializationEvent initEvent){
		proxy.init(initEvent);
	}
	
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent postInitEvent){
		proxy.postInit(postInitEvent);
	}
}