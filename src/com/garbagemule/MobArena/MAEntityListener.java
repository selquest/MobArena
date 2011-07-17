package com.garbagemule.MobArena;

import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.EntityCombustEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.event.entity.EntityListener;
import org.bukkit.event.entity.EntityRegainHealthEvent;
import org.bukkit.event.entity.EntityTargetEvent;

import com.garbagemule.MobArena.Arena;
import com.garbagemule.MobArena.ArenaMaster;

public class MAEntityListener extends EntityListener
{
    private ArenaMaster am;
    
    public MAEntityListener(ArenaMaster am)
    {
        this.am = am;
    }
    
    public void onEntityRegainHealth(EntityRegainHealthEvent event)
    {
        for (Arena arena : am.arenas)
            arena.onEntityRegainHealth(event);
    }
    
    public void onEntityDeath(EntityDeathEvent event)
    {
        for (Arena arena : am.arenas)
            arena.onEntityDeath(event);
    }
    
    public void onEntityDamage(EntityDamageEvent event)
    {
        for (Arena arena : am.arenas)
            arena.onEntityDamage(event);
    }

    public void onCreatureSpawn(CreatureSpawnEvent event)
    {
        for (Arena arena : am.arenas)
            arena.onCreatureSpawn(event);
    }

    public void onEntityExplode(EntityExplodeEvent event)
    {
        for (Arena arena : am.arenas)
            arena.onEntityExplode(event);
    }

    public void onEntityCombust(EntityCombustEvent event)
    {
        for (Arena arena : am.arenas)
            arena.onEntityCombust(event);
    }
    
    public void onEntityTarget(EntityTargetEvent event)
    {
        for (Arena arena : am.arenas)
            arena.onEntityTarget(event);
    }
}