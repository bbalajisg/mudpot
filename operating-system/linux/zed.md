# zed

zed $HOME/.config/wezterm/wezterm.lua



```
local wezterm = require 'wezterm'

return {
  -- Appearance
  color_scheme = 'Gruvbox Dark',
  font = wezterm.font_with_fallback {
    { family = "JetBrainsMono Nerd Font", weight = "Regular" },
    { family = "FiraCode Nerd Font", weight = "Regular" },
    { family = "Hack Nerd Font", weight = "Regular" },
  },
  font_size = 18.0,
  line_height = 1.2,
  cell_width = 1.0,
  adjust_window_size_when_changing_font_size = false,

  -- color_scheme = 'Catppuccin Mocha', -- Or 'Gruvbox Dark', 'Tokyo Night', 'Dracula'
  color_scheme = 'Gruvbox Dark',
  window_background_opacity = 0.92,
  text_background_opacity = 1.0,
  use_fancy_tab_bar = true,
  hide_tab_bar_if_only_one_tab = true,
  tab_bar_at_bottom = false,
  window_decorations = "RESIZE|TITLE", -- Minimal, no title bar
  enable_tab_bar = true,

  -- Performance
  front_end = 'WebGpu', -- If issues, fallback to "OpenGL"
  max_fps = 144, -- depends on your monitor
  enable_scroll_bar = false,
  scrollback_lines = 10000,

  -- Terminal behavior
  enable_wayland = false,
  scrollback_lines = 10000,
  check_for_updates = false,
  automatically_reload_config = true,

  -- Clipboard
  enable_kitty_keyboard = true,
  enable_csi_u_key_encoding = true,

  -- Keybindings
  keys = {
    -- Pane Splits
    { key = "|", mods = "ALT|SHIFT", action = wezterm.action.SplitHorizontal{domain="CurrentPaneDomain"} },
    { key = "-", mods = "ALT", action = wezterm.action.SplitVertical{domain="CurrentPaneDomain"} },

    -- Pane Navigation
    { key = "h", mods = "ALT", action = wezterm.action.ActivatePaneDirection("Left") },
    { key = "l", mods = "ALT", action = wezterm.action.ActivatePaneDirection("Right") },
    { key = "k", mods = "ALT", action = wezterm.action.ActivatePaneDirection("Up") },
    { key = "j", mods = "ALT", action = wezterm.action.ActivatePaneDirection("Down") },

    -- Copy-Paste
    { key = "c", mods = "CMD", action = wezterm.action.CopyTo("Clipboard") },
    { key = "v", mods = "CMD", action = wezterm.action.PasteFrom("Clipboard") },
  },

 -- Other nice-to-haves
 adjust_window_size_when_changing_font_size = false,
 window_padding = {
    left = 4,
    right = 4,
    top = 2,
    bottom = 2,
  },

  -- Misc
  audible_bell = "Disabled",
  check_for_updates = false,
  automatically_reload_config = true,

}

```
