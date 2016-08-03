package com.jlgm.amw.main;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
	
	public void preInit(FMLPreInitializationEvent preInitEvent){
		Configuration config = new Configuration(preInitEvent.getSuggestedConfigurationFile());
		config.load();
		
		config.save();
	}
	
	public void init(FMLInitializationEvent initEvent){
		
	}
	
	public void postInit(FMLPostInitializationEvent postInitEvent){
		
	}
}