scoreboard objectives add wither_skeleton_kills dummy

scoreboard players add @s wither_skeleton_kills 1

advancement revoke @s only istars-mob-pedestal:wither_skeleton_kill

execute as @s if score @s wither_skeleton_kills matches 50.. run give @s istars-mob-pedestal:wither_skeleton_soul 1

execute as @s if score @s wither_skeleton_kills matches 50.. run scoreboard players set @s wither_skeleton_kills 0