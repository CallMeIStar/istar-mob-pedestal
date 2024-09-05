scoreboard objectives add magma_cube_kills dummy

scoreboard players add @s magma_cube_kills 1

advancement revoke @s only istars-mob-pedestal:magma_cube_kill

execute as @s if score @s magma_cube_kills matches 50.. run give @s istars-mob-pedestal:magma_cube_soul 1

execute as @s if score @s magma_cube_kills matches 50.. run scoreboard players set @s magma_cube_kills 0